

class Client(
    private val invoker: Invoker,
    private val concreteCommand: ConcreteCommand,
    private val receiver: Receiver
)

class Invoker(
    private val command: Command
) {
    fun call() {
        command.execute()
    }
}

interface Command {
    fun execute()
}

class ConcreteCommand(
    private val receiver: Receiver
) : Command {
    override fun execute() {
        receiver.action()
    }
}

class Receiver {
    fun action() {
        println("Receiver action")
    }
}