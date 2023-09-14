package org.camrent.test

import java.io.File

fun main() {

    val directoryNmae = "icon"
    val directoryPath = "src/main/kotlin/org/camrent/database/image/$directoryNmae"

    val directory = File(directoryPath)

    if (directory.exists()) {
        println("Directory already exists.")
    } else {
        val created = directory.mkdirs()
        if (created) {
            println("Directory created successfully.")
        } else {
            println("Failed to create directory.")
        }
    }
}
