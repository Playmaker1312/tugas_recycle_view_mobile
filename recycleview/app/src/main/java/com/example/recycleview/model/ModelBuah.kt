package com.example.recycleview.model

import com.example.recycleview.R

//deklarasi data class model
data class ModelBuah(
    val image : Int,
    val judul : String
)
//buat array
object  MockList {

    fun getModel() : List<ModelBuah> {
        val item1 = ModelBuah(
            R.drawable.apple,
            "apel"
        )

        val item2 = ModelBuah(
            R.drawable.strawberry,
            "strawberry"
        )

        val item3 = ModelBuah(
            R.drawable.orange,
            "jeruk"
        )

        val item4 = ModelBuah(
            R.drawable.pear,
            "pear"
        )

        val item5 = ModelBuah(
            R.drawable.strawberry,
            ""
        )

        val item6 = ModelBuah(
            R.drawable.apple,
            "apel"
        )

        val itemList : ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)

        return itemList
    }

}