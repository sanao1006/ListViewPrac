package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        lvMenu.onItemClickListener = ListItemClickListener()
    }
    private  inner class  ListItemClickListener: AdapterView.OnItemClickListener{
//        @parent : タップされたリスト全体
//        @view : タップされた1行分の画面部品そのもの @
//        @position : 行番号 0スタート
//        @DBの主キー
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            var item = parent.getItemAtPosition(position) as String
            val show = "あなたが選んだ定食: $item"
            Toast.makeText(this@MainActivity,show,Toast.LENGTH_LONG).show()
        }

    }
}