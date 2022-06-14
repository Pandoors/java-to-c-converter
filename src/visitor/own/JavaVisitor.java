package visitor.own;

import com.sun.source.tree.IdentifierTree;
import org.antlr.v4.misc.Graph;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.compiler.Bytecode;
import visitor.JavaGrBaseVisitor;
import visitor.JavaGrParser;

import javax.print.DocFlavor;

public class JavaVisitor extends JavaGrBaseVisitor<String> {


    @Override
    public String visitProg(JavaGrParser.ProgContext ctx) {

        StringBuilder sb = new StringBuilder();
        //visiting packages
        sb.append(visitPackage(ctx.package_()));
        //visiting imports
        for (JavaGrParser.Import_opContext ip : ctx.import_op()) {
            sb.append(visitImport_op(ip));
        }
        sb.append("using namespace std;\n");


        //visiting class
        sb.append(visitClass(ctx.class_()));


        return sb.toString();
    }

    @Override
    public String visitNumeric_type(JavaGrParser.Numeric_typeContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.INT() != null) {
            sb.append(ctx.INT());
        } else if (ctx.FLOAT() != null) {
            sb.append(ctx.FLOAT());
        } else if (ctx.DOUBLE() != null) {
            sb.append(ctx.DOUBLE());
        }
        return sb.toString();

    }

    //text_type: CHAR
//| STRING;
    @Override
    public String visitText_type(JavaGrParser.Text_typeContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.CHAR() != null) {
            sb.append(ctx.CHAR());
        } else if (ctx.STRING() != null) {
            sb.append(ctx.STRING());
        }


        return sb.toString();
    }

    //datatype: numeric_type
//| text_type
//| BOOL;
    @Override
    public String visitDatatype(JavaGrParser.DatatypeContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.BOOL() != null) {
            sb.append(ctx.BOOL());
        } else if (ctx.numeric_type() != null) {
            sb.append(visitNumeric_type(ctx.numeric_type()));
        } else if (ctx.text_type() != null) {
            sb.append(visitText_type(ctx.text_type()));
        }
        return sb.toString();
    }

    @Override
    public String visitBool_val(JavaGrParser.Bool_valContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.TRUE() != null){
            sb.append(ctx.TRUE());
        } else if(ctx.FALSE() != null){
            sb.append(ctx.FALSE());
        }


        return sb.toString();
    }


    @Override
    public String visitNum_val(JavaGrParser.Num_valContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.INT_VAL() != null) {
            if (ctx.ADD_() != null) {
                sb.append(ctx.ADD_());
            } else if (ctx.SUBTRACT_() != null) {
                sb.append(ctx.SUBTRACT_());
            }
            sb.append(ctx.INT_VAL());
        } else if (ctx.DOUBLE_VAL() != null) {
            if (ctx.ADD_() != null) {
                sb.append(ctx.ADD_());
            } else if (ctx.SUBTRACT_() != null) {
                sb.append(ctx.SUBTRACT_());
            }
            sb.append(ctx.DOUBLE_VAL());

        } else if (ctx.FLOAT_VAL() != null) {
            if (ctx.ADD_() != null) {
                sb.append(ctx.ADD_());
            } else if (ctx.SUBTRACT_() != null) {
                sb.append(ctx.SUBTRACT_());
            }
            sb.append(ctx.FLOAT_VAL());
        } else if (ctx.IDENTIFIER() != null) {
            if (ctx.ADD_() != null) {
                sb.append(ctx.ADD_());
            } else if (ctx.SUBTRACT_() != null) {
                sb.append(ctx.SUBTRACT_());
            }
            sb.append(ctx.IDENTIFIER());
        }
        return sb.toString();

    }

    @Override
    public String visitDeclaration_var(JavaGrParser.Declaration_varContext ctx) {

        StringBuilder sb = new StringBuilder();

        if (ctx.declaration() != null) {

            sb.append(visitDeclaration(ctx.declaration()));

        } else if (ctx.assignment() != null) {

            sb.append(visitAssignment(ctx.assignment()));

        }

        sb.append(ctx.SEMICOLON());
        sb.append("\n");
        return sb.toString();

    }

    //input_vars: datatype IDENTIFIER (COMMA datatype IDENTIFIER)*;
    @Override
    public String visitInput_vars(JavaGrParser.Input_varsContext ctx) {
        StringBuilder sb = new StringBuilder();
        int s = 0;
        if (ctx.datatype().size() == 1) {
            if (visitDatatype(ctx.datatype().get(0)).equals("string")) {
                sb.append("char ");
                sb.append(ctx.IDENTIFIER().get(0) + "[]");
            } else {
                sb.append(visitDatatype(ctx.datatype().get(0)));
                sb.append(ctx.IDENTIFIER().get(0));
            }
        } else if (ctx.datatype().size() > 1) {

            if (visitDatatype(ctx.datatype().get(0)).equals("string")) {
                sb.append("char ");
                sb.append(ctx.IDENTIFIER().get(0) + "[]");
            } else {
                sb.append(visitDatatype(ctx.datatype().get(0)));
                sb.append(ctx.IDENTIFIER().get(0));
            }

            if ((ctx.COMMA().size() == ctx.IDENTIFIER().size() - 1) && (ctx.IDENTIFIER().size() - 1 == ctx.datatype().size() - 1)) {
                s = ctx.COMMA().size();

                for (int i = 0; i < s; i++) {
                    sb.append(ctx.COMMA().get(i));
                    if (visitDatatype(ctx.datatype().get(i + 1)).equals("string")) {
                        sb.append("char ");
                        sb.append(ctx.IDENTIFIER().get(i + 1) + "[]");
                    } else {
                        sb.append(visitDatatype(ctx.datatype().get(i + 1)));
                        sb.append(ctx.IDENTIFIER().get(i + 1));
                    }
                }
            }

        }


        return sb.toString();
    }

    //function_in: BRACKET_L input_vars? BRACKET_R;
    @Override
    public String visitFunction_in(JavaGrParser.Function_inContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.BRACKET_L());

        if (ctx.input_vars() != null) {
            sb.append(visitInput_vars(ctx.input_vars()));
        }

        sb.append(ctx.BRACKET_R());

        return sb.toString();
    }

    @Override
    public String visitFunction_to_ret(JavaGrParser.Function_to_retContext ctx) {
        return "";
    }

    @Override
    public String visitReturn_statement(JavaGrParser.Return_statementContext ctx) {
        return "";
    }

    @Override
    public String visitElif_statement(JavaGrParser.Elif_statementContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(visitIf_statement(ctx.if_statement()));
        sb.append(ctx.ELSE());
        sb.append(visitElif_statement(ctx.elif_statement()));
        return sb.toString();
    }


    @Override
    public String visitInstruction(JavaGrParser.InstructionContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.declaration() != null) {
            sb.append(visitDeclaration(ctx.declaration()));
            sb.append(ctx.SEMICOLON() + "\n");
        } else if (ctx.assignment() != null) {
            sb.append(visitAssignment(ctx.assignment()));
            sb.append(ctx.SEMICOLON() + "\n");
        } else if (ctx.modification() != null) {
            sb.append(visitModification(ctx.modification()));
            sb.append(ctx.SEMICOLON() + "\n");
        } else if (ctx.if_statement() != null) {
            sb.append(visitIf_statement(ctx.if_statement()));
        } else if (ctx.elif_statement() != null) {
            sb.append(visitElif_statement(ctx.elif_statement()));
        } else if (ctx.while_loop() != null) {
            sb.append(visitWhile_loop(ctx.while_loop()));
        } else if (ctx.do_while_loop() != null) {
            sb.append(visitDo_while_loop(ctx.do_while_loop()));
        } else if (ctx.for_loop() != null) {
            sb.append(visitFor_loop(ctx.for_loop()));
        } else if (ctx.return_statement() != null) {
            sb.append(visitReturn_statement(ctx.return_statement()));
            sb.append(ctx.SEMICOLON() + "\n");
        }


        return sb.toString();
    }

    //instruction_general: (instruction | COMMENT)*;
    @Override
    public String visitInstruction_general(JavaGrParser.Instruction_generalContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree pt : ctx.children) {

                if (pt instanceof JavaGrParser.InstructionContext) {

                    JavaGrParser.InstructionContext instructionContext = (JavaGrParser.InstructionContext) pt;
                    sb.append(visitInstruction(instructionContext));

                } else {
                    TerminalNode tn = (TerminalNode) pt;
                    sb.append(tn);
                }

            }
        }

        return sb.toString();
    }

    //function_body: PARENT_L instruction_general PARENT_R;
    @Override
    public String visitFunction_body(JavaGrParser.Function_bodyContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.PARENT_L() + "\n");

        sb.append(visitInstruction_general(ctx.instruction_general()));

        sb.append(ctx.PARENT_R() + "\n");


        return sb.toString();
    }

    //function: (PUBLIC | PRIVATE_NEW_VAR | PROTECTED_NEW_VAR) STATIC_VAR? (datatype | VOID ) IDENTIFIER function_in function_body ;
    @Override
    public String visitFunction(JavaGrParser.FunctionContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.datatype() != null) {
            sb.append(visitDatatype(ctx.datatype()));
        } else if (ctx.VOID() != null) {
            sb.append(ctx.VOID());
        }
        sb.append(" ");

        if (ctx.IDENTIFIER() != null) {
            sb.append(ctx.IDENTIFIER());
        }

        if (ctx.function_in() != null) {
            sb.append(visitFunction_in(ctx.function_in()));
        }

        if (ctx.function_body() != null) {
            sb.append(visitFunction_body(ctx.function_body()));
        }

        return sb.toString();
    }

    @Override
    public String visitClass(JavaGrParser.ClassContext ctx) {

        StringBuilder sb = new StringBuilder();


        for (JavaGrParser.ContentContext ct : ctx.content()) {

            if (ct.function() != null) {
                sb.append(visitFunction(ct.function()));
            } else if (ct.declaration_var() != null) {
                sb.append(visitDeclaration_var(ct.declaration_var()));
            }
        }


        return sb.toString();
    }

    @Override
    public String visitMath_symbol(JavaGrParser.Math_symbolContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.ADD_() != null) {
            sb.append(ctx.ADD_());

        } else if (ctx.SUBTRACT_() != null) {
            sb.append(ctx.SUBTRACT_());

        } else if (ctx.MULTIPLY() != null) {
            sb.append(ctx.MULTIPLY());

        } else if (ctx.DIVIDE() != null) {
            sb.append(ctx.DIVIDE());

        } else if (ctx.MODULO() != null) {
            sb.append(ctx.MODULO());

        }
        return sb.toString();

    }

    //add_equals: ADD_ EQUAL;
    @Override
    public String visitAdd_equals(JavaGrParser.Add_equalsContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.ADD_());
        sb.append(ctx.EQUAL());


        return sb.toString();
    }

    //subtract_equals: SUBTRACT_ EQUAL;
    @Override
    public String visitSubtract_equals(JavaGrParser.Subtract_equalsContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.SUBTRACT_());
        sb.append(ctx.EQUAL());

        return sb.toString();

    }

    //multiply_equals: MULTIPLY EQUAL;
    @Override
    public String visitMultiply_equals(JavaGrParser.Multiply_equalsContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.MULTIPLY());

        sb.append(ctx.EQUAL());

        return sb.toString();
    }

    //divide_equals: DIVIDE EQUAL;
    @Override
    public String visitDivide_equals(JavaGrParser.Divide_equalsContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.DIVIDE());
        sb.append(ctx.EQUAL());

        return sb.toString();
    }

    //modulo_equals: MODULO EQUAL;
    @Override
    public String visitModulo_equals(JavaGrParser.Modulo_equalsContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.MODULO());
        sb.append(ctx.EQUAL());

        return sb.toString();
    }

    //math_modification: add_equals
//| subtract_equals
//| multiply_equals
//| divide_equals
//| modulo_equals
//| EQUAL;
    @Override
    public String visitMath_modification(JavaGrParser.Math_modificationContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.add_equals() != null) {
            sb.append(visitAdd_equals(ctx.add_equals()));
        } else if (ctx.subtract_equals() != null) {
            sb.append(visitSubtract_equals(ctx.subtract_equals()));
        } else if (ctx.multiply_equals() != null) {
            sb.append(visitMultiply_equals(ctx.multiply_equals()));
        } else if (ctx.divide_equals() != null) {
            sb.append(visitDivide_equals(ctx.divide_equals()));
        } else if (ctx.modulo_equals() != null) {
            sb.append(visitModulo_equals(ctx.modulo_equals()));
        } else if (ctx.EQUAL() != null) {
            sb.append(ctx.EQUAL());
        }

        return sb.toString();
    }

    @Override
    public String visitMath_expr(JavaGrParser.Math_exprContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.math_expr().size() == 2) {
            sb.append(visitMath_expr(ctx.math_expr().get(0)));
            sb.append(visitMath_symbol(ctx.math_symbol()) + " ");
            sb.append(visitMath_expr(ctx.math_expr().get(1)));
        } else if (ctx.num_val() != null) {
            sb.append(visitNum_val(ctx.num_val()) + " ");
        } else if (ctx.BRACKET_L() != null) {
            sb.append(ctx.BRACKET_L() + " ");
            sb.append(visitMath_expr(ctx.math_expr().get(0)));
            sb.append(ctx.BRACKET_R() + " ");
        }


        return sb.toString();
    }

    @Override
    public String visitDeclaration(JavaGrParser.DeclarationContext ctx) {
        StringBuilder sb = new StringBuilder();

        String datatype = visitDatatype(ctx.datatype());
        if (datatype.equals("string")) {
            sb.append("char ");
            sb.append(ctx.IDENTIFIER() + "[]");
        } else {
            sb.append(datatype + " ");
            sb.append(ctx.IDENTIFIER());
        }
        for (JavaGrParser.Comma_identifierContext ct : ctx.comma_identifier()) {
            sb.append(ct.COMMA() + " ");
            sb.append(ct.IDENTIFIER());
        }

        return sb.toString();
    }

    @Override
    public String visitAssignment(JavaGrParser.AssignmentContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.numeric_type() != null) {
            sb.append(visitNumeric_type(ctx.numeric_type()));
            sb.append(" " + ctx.IDENTIFIER());
            sb.append(" " + ctx.EQUAL() + " ");
            sb.append(visitMath_expr(ctx.math_expr()));
        } else if (ctx.CHAR() != null) {
            sb.append(ctx.CHAR());
            sb.append(" " + ctx.IDENTIFIER());
            sb.append(" " + ctx.EQUAL() + " ");
            sb.append(ctx.CHAR_VAL());
        } else if (ctx.STRING() != null) {
            sb.append("char");
            sb.append(" " + ctx.IDENTIFIER() + "[]");
            sb.append(" " + ctx.EQUAL() + " ");
            sb.append(ctx.STRING_VAL());
        } else if (ctx.BOOL() != null) {
            sb.append(ctx.BOOL());
            sb.append(" " + ctx.IDENTIFIER());
            sb.append(" " + ctx.EQUAL() + " ");
            sb.append(visitBool_val(ctx.bool_val()));
        }

        return sb.toString();
    }

    //add_double: ADD_ ADD_;
    @Override
    public String visitAdd_double(JavaGrParser.Add_doubleContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.ADD_().get(0));
        sb.append(ctx.ADD_().get(1));

        return sb.toString();
    }
//equal_double: EQUAL  EQUAL;
    @Override
    public String visitEqual_double(JavaGrParser.Equal_doubleContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.EQUAL().get(0));
        sb.append(ctx.EQUAL().get(1));


        return sb.toString();
    }

    //subtract_double: SUBTRACT_ SUBTRACT_;
    @Override
    public String visitSubtract_double(JavaGrParser.Subtract_doubleContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.SUBTRACT_().get(0));
        sb.append(ctx.SUBTRACT_().get(1));


        return sb.toString();
    }

    //modification: IDENTIFIER math_modification math_expr
//| IDENTIFIER add_double
//| IDENTIFIER subtract_double;
    @Override
    public String visitModification(JavaGrParser.ModificationContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.IDENTIFIER());
        if (ctx.math_modification() != null) {
            sb.append(visitMath_modification(ctx.math_modification()));
            sb.append(visitMath_expr(ctx.math_expr()));
        } else if (ctx.add_double() != null) {
            sb.append(visitAdd_double(ctx.add_double()));
        } else if (ctx.subtract_double() != null) {
            sb.append(visitSubtract_double(ctx.subtract_double()));
        }

        return sb.toString();
    }


    @Override
    public String visitComparator(JavaGrParser.ComparatorContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.equal_double() != null) {
            sb.append(visitEqual_double(ctx.equal_double()));
        } else if (ctx.NOT_EQUAL() != null) {
            sb.append(ctx.NOT_EQUAL());
        } else if (ctx.GREATER() != null) {
            sb.append(ctx.GREATER());
        } else if (ctx.LESS() != null) {
            sb.append(ctx.LESS());
        } else if (ctx.GREATER_EQUAL() != null) {
            sb.append(ctx.GREATER_EQUAL());
        } else if (ctx.LESS_EQUAL() != null) {
            sb.append(ctx.LESS_EQUAL());
        }


        return sb.toString();
    }

    //comparison: num_val comparator num_val;
    @Override
    public String visitComparison(JavaGrParser.ComparisonContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visitNum_val(ctx.num_val().get(0)));
        sb.append(visitComparator(ctx.comparator()));
        sb.append(visitNum_val(ctx.num_val().get(1)));

        return sb.toString();
    }

    @Override
    public String visitLogic_statement(JavaGrParser.Logic_statementContext ctx) {
        StringBuilder sb = new StringBuilder();
        if(ctx.comparison() != null) sb.append(visitComparison(ctx.comparison()));
        else if (ctx.bool_val() != null) sb.append(visitBool_val(ctx.bool_val()));

        return sb.toString();
    }

    @Override
    public String visitLogic_operator(JavaGrParser.Logic_operatorContext ctx) {
        StringBuilder sb = new StringBuilder();
        if(ctx.AND() != null) sb.append(ctx.AND());
        else if(ctx.OR() != null) sb.append(ctx.OR());

        return sb.toString();
    }

    @Override
    public String visitLogic_condition(JavaGrParser.Logic_conditionContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.BRACKET_L());
        if(ctx.logic_statement().size() == 1) {
            sb.append(visitLogic_statement(ctx.logic_statement().get(0)));
        } else if(ctx.logic_statement().size() > 1){
            for(int i=0; i < ctx.logic_operator().size(); i++){
                sb.append(visitLogic_operator(ctx.logic_operator().get(i)));
                sb.append(" " + visitLogic_statement(ctx.logic_statement().get(i)));
            }
        }
        sb.append(ctx.BRACKET_R());
        return sb.toString();
    }

    @Override
    public String visitIf_statement(JavaGrParser.If_statementContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.IF());
        sb.append(visitLogic_condition(ctx.logic_condition()));
        sb.append((ctx.PARENT_L()) + "\n");
        sb.append(visitInstruction_general(ctx.instruction_general()));
        sb.append(ctx.PARENT_R() + "\n");
        return sb.toString();
    }

    //while_loop: WHILE logic_condition PARENT_L instruction_general PARENT_R;
    @Override
    public String visitWhile_loop(JavaGrParser.While_loopContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.WHILE());
        sb.append(ctx.logic_condition());
        sb.append(ctx.PARENT_L() + "\n");
        sb.append(ctx.instruction_general());
        sb.append(ctx.PARENT_R() + "\n");

        return sb.toString();
    }

    //do_while_loop: DO_ PARENT_L instruction_general PARENT_R WHILE logic_condition;
    @Override
    public String visitDo_while_loop(JavaGrParser.Do_while_loopContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.DO_());
        sb.append(ctx.PARENT_L() + "\n");
        sb.append(visitInstruction_general(ctx.instruction_general()));
        sb.append(ctx.PARENT_R() + "\n");
        sb.append(ctx.WHILE());
        sb.append(visitLogic_condition(ctx.logic_condition()));

        return sb.toString();
    }

    //for_loop: FOR BRACKET_L assignment SEMICOLON comparison SEMICOLON modification BRACKET_R PARENT_L instruction_general PARENT_R;
    @Override
    public String visitFor_loop(JavaGrParser.For_loopContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(ctx.FOR());
        sb.append(ctx.BRACKET_L());
        sb.append(visitAssignment(ctx.assignment()));
        sb.append(ctx.SEMICOLON().get(0));
        sb.append(" " + visitComparison(ctx.comparison()));
        sb.append(ctx.SEMICOLON().get(1));
        sb.append(" " + visitModification(ctx.modification()));
        sb.append(ctx.BRACKET_R());
        sb.append(ctx.PARENT_L() + "\n");
        sb.append(visitInstruction_general(ctx.instruction_general()));
        sb.append(ctx.PARENT_R() + "\n");

        return sb.toString();
    }

    @Override
    public String visitPackage(JavaGrParser.PackageContext ctx) {

        return "";
    }

    @Override
    public String visitImport_op(JavaGrParser.Import_opContext ctx) {
        StringBuilder sb = new StringBuilder();
        boolean first = false;
        sb.append("#include").append("<");
        for (TerminalNode tn : ctx.IDENTIFIER()) {
            if (!first) {
                sb.append(tn);
            } else {
                sb.append("/").append(tn);
            }
            first = true;

        }

        return sb.append(">").append("\n").toString();
    }
}