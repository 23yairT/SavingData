package com.raywenderlich.android.trippey.files

import java.io.File
import java.io.FileOutputStream

class FilesHelperImpl(private val directory: File): FilesHelper {

    override fun saveData(fileName: String, data: String) {
        val file = buildFile(fileName)
        val fileOutputStream = buildOutputStream(file)

        try {
            fileOutputStream.use {
                it.write(data.toByteArray())
            }
        }
    }

    override fun getData(): List<File> {

    }

    override fun deleteData(fileName: String) {

    }

    private fun buildFile(fileName: String): File{
        return File(directory, fileName)
    }

    private fun buildOutputStream(file: File): FileOutputStream {
        return FileOutputStream(file)
    }

}