package com.example.massiveapp.data

import com.example.massiveapp.R
import com.example.massiveapp.model.Arsitek
import com.example.massiveapp.model.DesainRumah
import com.example.massiveapp.model.Project

object datadummy {

    val Arsiteks = listOf(
        Arsitek (
            id = 1,
            name = "Allisa Gerand",
            role = "Architect & Building Designer",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. \n" +
                    "Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. \n" +
                    "Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            photo = R.drawable.arsitel_cewe1,
            nohp = +62-8123-4567-8901,
            website = "www.website.com",
            hargajasa = "Rp xxx.xxx.xxx"
        ),
        Arsitek (
            id = 2,
            name = "Adam wong",
            role = "Architect",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. \n" +
                "Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. \n" +
                "Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            photo = R.drawable.arsitek_cewe,
            nohp = +62-8123-4567-8901,
            website = "www.website.com",
            hargajasa = "Rp xxx.xxx.xxx"
    )

    )

    val DesainRumahs = listOf(
        DesainRumah(
            id = 1,
            name = "Japan Modern Sakura",
            description = "Belum tau",
            price = "Rp xxx.xxx.xxx",
            photo = R.drawable.rumah1
        )
    )

     val Projects = listOf(
         Project(
             id = 1,
             name = "Modern House White",
             place ="Bali",
             price = "Rp xxx.xxx.xxx",
             year = "2015",
             photo = R.drawable.project1
         )

     )


}