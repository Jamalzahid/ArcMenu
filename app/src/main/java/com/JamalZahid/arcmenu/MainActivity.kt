package com.JamalZahid.arcmenu

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.JamalZahid.arcmenu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(),ArcMenu.OnClickMenuListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
           val arcMenu = ArcMenu.Builder(this)
                .addBtns(
                    ArcButton.Builder(R.drawable.ic_add_to_photo, 1),
                    ArcButton.Builder(R.drawable.ic_add_to_photo, 2),
                    ArcButton.Builder(R.drawable.ic_add_to_photo, 3),
                    ArcButton.Builder(R.drawable.ic_add_to_photo, 4),
                    ArcButton.Builder(R.drawable.ic_add_to_photo, 5),
                    ArcButton.Builder(
                        SimpleCirView(this)
                            .setText("2")
                            .setCirColor(Color.parseColor("#03A9F4"))
                            .setTextColor(Color.WHITE)
                            .setTextSizeInSp(22)
                            .setBackgroundRadiusInPx(40),
                        6
                    )
                )
                .setListener(this@MainActivity)
                .showOnLongClick(it)
                .setDegree(160.0)
                .setRadius(300)
                .build()

            arcMenu.showOn(it) //Show Manually

        }

    }

    override fun onClickArcMenu(arcMenu: ArcMenu?, v: View?, clickedMenuId: Int) {

    }
}