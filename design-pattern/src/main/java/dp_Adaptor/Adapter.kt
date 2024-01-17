class Client(
    private val adapter: Adapter
)

interface Adapter {
    fun operation()
}

class Adaptee {
    fun specificOperation() {
        println("Adaptee specificOperation")
    }
}

class ConcreteAdapter(
    private val adaptee: Adaptee
) : Adapter {
    override fun operation() {
        println("ConcreteAdapter operator")
    }
}
