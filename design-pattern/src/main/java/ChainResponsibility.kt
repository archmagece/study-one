

class Client(
    private val handler: Handler
)

interface Handler {
    fun handleRequest()
}

class ConcreteHandler1(
    private val handler: Handler
) : Handler {
    override fun handleRequest() {
        println("ConcreteHandler1 handleRequest")
        handler.handleRequest()
    }
}

class ConcreteHandler2(
    private val handler: Handler
) : Handler {
    override fun handleRequest() {
        println("ConcreteHandler2 handleRequest")
        handler.handleRequest()
    }
}