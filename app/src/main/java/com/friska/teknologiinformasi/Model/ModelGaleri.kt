package com.friska.teknologiinformasi.Model

import com.friska.teknologiinformasi.R

data class ModelGaleri(
    val image : Int
)
object Mocklist{
    fun getModel() : List<ModelGaleri> {
        val itemModel1 = ModelGaleri(
            R.drawable.gambar1
        )
        val itemModel2 = ModelGaleri(
            R.drawable.gambar2
        )

        val itemModel3 = ModelGaleri(
            R.drawable.gambar3
        )

        val itemModel4 = ModelGaleri(
            R.drawable.gambar4
        )

        val itemModel5 = ModelGaleri(
            R.drawable.gambar5
        )

        val itemModel6 = ModelGaleri(
            R.drawable.gambar6
        )
        val itemList: ArrayList<ModelGaleri> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}
