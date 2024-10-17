1 - Main Activity.kt
package com.example.recyclerviewexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private val itemList = mutableListOf<Item>()
    private lateinit var editTextName: EditText
    private lateinit var editTextDescription: EditText
    private lateinit var buttonAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        editTextName = findViewById(R.id.editTextName)
        editTextDescription = findViewById(R.id.editTextDescription)
        buttonAdd = findViewById(R.id.buttonAdd)

        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = MyAdapter(itemList)
        recyclerView.adapter = adapter

        buttonAdd.setOnClickListener {
            val name = editTextName.text.toString()
            val description = editTextDescription.text.toString()
            itemList.add(Item(name, description))
            adapter.notifyDataSetChanged()
        }
    }
}
/////////////
2 - My Adpater.kt
package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.itemTitle)
        val description: TextView = view.findViewById(R.id.itemDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = itemList[position].name
        holder.description.text = itemList[position].description
    }

    override fun getItemCount() = itemList.size
}

////////////////

3 - Item Layout.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical">

    <TextView
        android:id="@+id/itemTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp" />

    <TextView
        android:id="@+id/itemDescription"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
</LinearLayout>

//////////////////////

4 - Activity_Main.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <EditText
        android:id="@+id/editTextName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Nome" />

    <EditText
        android:id="@+id/editTextDescription"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Descrição" />

    <Button
        android:id="@+id/buttonAdd"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Adicionar" />
</RelativeLayout>

///////////////////////////

5 - Item.kt
package com.example.recyclerviewexample

data class Item(val name: String, val description: String)


//////////////////////////////Corretos /////////////////////////////////////////
1 - Main Activity.kt

package com.example.recyclerviewexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private val itemList = mutableListOf<Item>()
    private lateinit var editTextName: EditText
    private lateinit var editTextDescription: EditText
    private lateinit var buttonAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        editTextName = findViewById(R.id.editTextName)
        editTextDescription = findViewById(R.id.editTextDescription)
        buttonAdd = findViewById(R.id.buttonAdd)

        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = MyAdapter(itemList)
        recyclerView.adapter = adapter

        buttonAdd.setOnClickListener {
            val name = editTextName.text.toString()
            val description = editTextDescription.text.toString()
            if (name.isNotEmpty() && description.isNotEmpty()) {
                itemList.add(Item(name, description))
                adapter.notifyItemInserted(itemList.size - 1) // Melhor prática para notificação
                editTextName.text.clear() // Limpar campo após adição
                editTextDescription.text.clear() // Limpar campo após adição
            }
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////

2 - My Adpater.kt

package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.itemTitle)
        val description: TextView = view.findViewById(R.id.itemDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = itemList[position].name
        holder.description.text = itemList[position].description
    }

    override fun getItemCount() = itemList.size
}

///////////////////////////////////////////////////////////////////////////////////////////////

3 - Item Layout.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical">

    <TextView
        android:id="@+id/itemTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp" />

    <TextView
        android:id="@+id/itemDescription"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
</LinearLayout>

////////////////////////////////////////////////////////////////////////////////////////////

4 - Activity_Main.xml

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <EditText
        android:id="@+id/editTextName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Nome" />

    <EditText
        android:id="@+id/editTextDescription"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Descrição" />

    <Button
        android:id="@+id/buttonAdd"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Adicionar" />
</RelativeLayout>


/////////////////////////////////////////////////////////////////////////////////////////////////

5 - Item.kt

package com.example.recyclerviewexample

data class Item(val name: String, val description: String)
