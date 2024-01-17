
class Client(
    private val context: Context,
    private val expression: AbstractExpression,
)

class Context(
    private val input: String,
    private val output: String,
)

abstract class AbstractExpression {
    abstract fun interpret(context: Context)
}

class TerminalExpression(
    private val data: String
) : AbstractExpression() {
    override fun interpret(context: Context) {
        println("TerminalExpression interpret")
    }
}

class NonterminalExpression(
    private val expression1: AbstractExpression,
    private val expression2: AbstractExpression,
) : AbstractExpression() {
    override fun interpret(context: Context) {
        println("NonterminalExpression interpret")
    }
}