package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.newapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var text = ""

    companion object {
        const val TAG = "Main Activity"
        const val KEY_ITEM = "item_key"

    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate called")
        if (savedInstanceState != null) {
            text = savedInstanceState.getString(KEY_ITEM, "")
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBTN.setOnClickListener {
            val newitem = binding.add.text.toString()

            when {
                newitem.isEmpty() -> {
                    Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
                }
                else -> {
                    Toast.makeText(
                        this,
                        "Congratulations $newitem has been added successfully to your Cart!",
                        Toast.LENGTH_LONG
                    ).show()
                    binding.add.text.clear()
                }
            }

        }

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstance called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
//        outState.putInt(KEY_ITEM, "" )
        Log.d(TAG, "onSaveInstance called")
    }
}