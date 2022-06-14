package visitor.own;

import com.sun.source.tree.IdentifierTree;
import org.antlr.v4.misc.Graph;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitor.JavaGrBaseVisitor;
import visitor.JavaGrParser;

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

    @Override
    public String visitText_type(JavaGrParser.Text_typeContext ctx) {
        return "";
    }

    @Override
    public String visitDatatype(JavaGrParser.DatatypeContext ctx) {
        StringBuilder sb = new StringBuilder();

        if(ctx.BOOL() != null) sb.append(ctx.BOOL());
        else if (ctx.numeric_type() != null) sb.append(visitNumeric_type(ctx.numeric_type()));
        else if (ctx.text_type() != null) sb.append(visitText_type(ctx.text_type()));
        return sb.toString();
    }

    @Override
    public String visitBool_val(JavaGrParser.Bool_valContext ctx) {
        return "";
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

    @Override
    public String visitInput_vars(JavaGrParser.Input_varsContext ctx) {
        return "";
    }

    @Override
    public String visitFunction_in(JavaGrParser.Function_inContext ctx) {
        return "";
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
        return "";
    }

    @Override
    public String visitInstruction(JavaGrParser.InstructionContext ctx) {
        return "";
    }

    @Override
    public String visitInstruction_general(JavaGrParser.Instruction_generalContext ctx) {
        return "";
    }

    @Override
    public String visitFunction_body(JavaGrParser.Function_bodyContext ctx) {
        return "";
    }

    @Override
    public String visitFunction(JavaGrParser.FunctionContext ctx) {
        return "";
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

    @Override
    public String visitAdd_equals(JavaGrParser.Add_equalsContext ctx) {
        return "";
    }

    @Override
    public String visitSubtract_equals(JavaGrParser.Subtract_equalsContext ctx) {
        return "";
    }

    @Override
    public String visitMultiply_equals(JavaGrParser.Multiply_equalsContext ctx) {
        return "";
    }

    @Override
    public String visitDivide_equals(JavaGrParser.Divide_equalsContext ctx) {
        return "";
    }

    @Override
    public String visitModulo_equals(JavaGrParser.Modulo_equalsContext ctx) {
        return "";
    }

    @Override
    public String visitMath_modification(JavaGrParser.Math_modificationContext ctx) {
        return "";
    }

    @Override
    public String visitMath_expr(JavaGrParser.Math_exprContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.math_expr().size() == 2) {
            sb.append(visitMath_expr(ctx.math_expr().get(0)));
            sb.append(visitMath_symbol(ctx.math_symbol())+ " ");
            sb.append(visitMath_expr(ctx.math_expr().get(1)));
        } else if (ctx.num_val() != null) {
            sb.append(visitNum_val(ctx.num_val()) + " ");
        } else if (ctx.BRACKET_L() != null) {
            sb.append(ctx.BRACKET_L()+ " ");
            sb.append(visitMath_expr(ctx.math_expr().get(0)));
            sb.append(ctx.BRACKET_R()+ " ");
        }


        return sb.toString();
    }

    @Override
    public String visitDeclaration(JavaGrParser.DeclarationContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(visitDatatype(ctx.datatype())+ " ");
        sb.append(ctx.IDENTIFIER());
        for(JavaGrParser.Comma_identifierContext ct: ctx.comma_identifier()){
            sb.append(ct.COMMA()+ " ");
            sb.append(ct.IDENTIFIER());
        }

        return  sb.toString();
    }

    @Override
    public String visitAssignment(JavaGrParser.AssignmentContext ctx) {
        StringBuilder sb = new StringBuilder();

        if (ctx.numeric_type() != null) {
            sb.append(visitNumeric_type(ctx.numeric_type()));
            sb.append(" " + ctx.IDENTIFIER());
            sb.append(" " + ctx.EQUAL()+ " ");
            sb.append(visitMath_expr(ctx.math_expr()));
        } else if (ctx.CHAR() != null) {
            sb.append(ctx.CHAR());
            sb.append(" " + ctx.IDENTIFIER());
            sb.append(" " +ctx.EQUAL()+ " ");
            sb.append(ctx.CHAR_VAL());
        } else if (ctx.STRING() != null) {
            sb.append(ctx.STRING());
            sb.append(" " + ctx.IDENTIFIER());
            sb.append(" " +ctx.EQUAL()+ " ");
            sb.append(ctx.STRING_VAL());
        } else if (ctx.BOOL() != null) {
            sb.append(ctx.BOOL());
            sb.append(" " + ctx.IDENTIFIER());
            sb.append(" " +ctx.EQUAL()+ " ");
            sb.append(visitBool_val(ctx.bool_val()));
        }

        return sb.toString();
    }

    @Override
    public String visitAdd_double(JavaGrParser.Add_doubleContext ctx) {
        return "";
    }

    @Override
    public String visitEqual_double(JavaGrParser.Equal_doubleContext ctx) {
        return "";
    }

    @Override
    public String visitSubtract_double(JavaGrParser.Subtract_doubleContext ctx) {
        return "";
    }

    @Override
    public String visitModification(JavaGrParser.ModificationContext ctx) {
        return "";
    }

    @Override
    public String visitComparator(JavaGrParser.ComparatorContext ctx) {
        return "";
    }

    @Override
    public String visitComparison(JavaGrParser.ComparisonContext ctx) {
        return "";
    }

    @Override
    public String visitLogic_statement(JavaGrParser.Logic_statementContext ctx) {
        return "";
    }

    @Override
    public String visitLogic_operator(JavaGrParser.Logic_operatorContext ctx) {
        return "";
    }

    @Override
    public String visitLogic_condition(JavaGrParser.Logic_conditionContext ctx) {
        return "";
    }

    @Override
    public String visitIf_statement(JavaGrParser.If_statementContext ctx) {
        return "";
    }

    @Override
    public String visitWhile_loop(JavaGrParser.While_loopContext ctx) {
        return "";
    }

    @Override
    public String visitDo_while_loop(JavaGrParser.Do_while_loopContext ctx) {
        return "";
    }

    @Override
    public String visitFor_loop(JavaGrParser.For_loopContext ctx) {
        return "";
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