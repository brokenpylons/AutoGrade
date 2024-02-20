package task

import java.io.File
import java.io.InputStream

fun echo(prefix: String, stream: InputStream) {
    val buffer = mutableListOf<Byte>()

    while (true) {
        val symbol = stream.read()
        if (symbol == -1) break
        buffer.add(symbol.toByte())

    }
    println(prefix + buffer.toByteArray().toString(Charsets.UTF_8))
}

fun main(args: Array<String>) {
    echo("ANSWER", File(args[0]).inputStream())
}