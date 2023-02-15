package workshop.kotlin.taskz


fun main() {
    //returner verdi og logg
    //also

    //let

    //run

    //with

    //apply

}

fun returnValueAndPrint(str: String) =
    str.also {
        println("Value is $str")
    }

fun createOrder() {
    val order = Order().also {
        it.id = 1
        it.price = 1231.56f
        it.items = listOf("Milk", "Honey")
        println("this: ${it.items}")
    }

    val order2 = Order().apply {
        this.id = 2
        this.price = 1231.56f
        this.items = listOf("Milk", "Honey")
    }

    val order3 = Order().let {
        it.id = 4
        it.price = 1231.56f
        it.items = listOf("Milk", "Honey")
        it.id
    }
    val order4 = Order().run {
        this.id = 4
        this.price = 1231.56f
        this.items = listOf("Milk", "Honey")
    }
    val order5 = Order()
    with(order) {
        this.id = 5
        this.price = 1.0f
        println("this: ${this.items}")

    }
}