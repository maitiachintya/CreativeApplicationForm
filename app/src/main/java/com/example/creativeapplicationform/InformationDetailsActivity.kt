package com.example.creativeapplicationform

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.creativeapplicationform.databinding.ActivityInformationDetailsBinding
import com.example.creativeapplicationform.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class InformationDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityInformationDetailsBinding
    var resultist: List<ModelClass.Data> = ArrayList()
    var progress: ProgressDialog ? = null
    private lateinit var rvAdapter: CustomizeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progress= ProgressDialog(this)
        progress?.setCanceledOnTouchOutside(false)
        binding = ActivityInformationDetailsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_information_details)
        setContentView(binding.root)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.rcview.setLayoutManager(layoutManager)
        progress?.show()
        val usersApi = RetrofitInstance.getInstance().create(ApiInterface::class.java)
        GlobalScope.launch {
            val response = usersApi.getquotes()
            progress?.dismiss()
            if (response != null) {
                resultist = response?.body()?.data!!

                runOnUiThread {
                    rvAdapter = CustomizeAdapter(resultist, this@InformationDetailsActivity)
                    binding.rcview.adapter = rvAdapter
                }
            }
         }
    }
}
