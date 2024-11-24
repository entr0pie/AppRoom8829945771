package br.edu.up.rgm8829945771.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ITEMS")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)