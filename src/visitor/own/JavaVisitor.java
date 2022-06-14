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
        sb.append("using namespace std;");


        //visiting class
        sb.append(visitClass(ctx.class_()));


        return sb.toString();
    }

    @Override
    public String visitNumeric_type(JavaGrParser.Numeric_typeContext ctx) {
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
        return "";
    }

    @Override
    public String visitDeclaration_var(JavaGrParser.Declaration_varContext ctx) {

        StringBuilder sb = new StringBuilder();

        if (ctx.declaration() != null) {

            sb.append(visitDeclaration(ctx.declaration()));

        } else if (ctx.assignment() != null) {

            sb.append(visitAssignment(ctx.assignment()));

        }


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
        return "";
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
        return "";
    }

    @Override
    public String visitDeclaration(JavaGrParser.DeclarationContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append(visitDatatype(ctx.datatype()));
        sb.append(ctx.IDENTIFIER());
        for(JavaGrParser.Comma_identifierContext ct: ctx.comma_identifier()){
            sb.append(ct.COMMA());
            sb.append(ct.IDENTIFIER());
        }

        return  sb.toString();
    }

    @Override
    public String visitAssignment(JavaGrParser.AssignmentContext ctx) {
        return "";
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