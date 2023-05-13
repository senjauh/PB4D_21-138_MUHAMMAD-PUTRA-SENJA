package com.example.datapegawainew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class DataFrag : Fragment() {
    lateinit var nik: String
    lateinit var nama : String
    lateinit var status : String
    lateinit var pekerjaan : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nik = arguments?.getString("keynik").toString()
        nama = arguments?.getString("keynama").toString()
        status = arguments?.getString("keystatus").toString()
        pekerjaan = arguments?.getString("keypekerjaan").toString()

        val tNik = view.findViewById<TextView>(R.id.txtNIK)
        val tNama = view.findViewById<TextView>(R.id.txtNama)
        val tStatus = view.findViewById<TextView>(R.id.txtStatus)
        val tPekerjaan = view.findViewById<TextView>(R.id.txtPekerjaan)
        val btnBack = view.findViewById<Button>(R.id.btnback)

        tNik.text = "$nik"
        tNama.text = "$nama"
        tStatus.text = "$status"
        tPekerjaan.text = "$pekerjaan"

        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_dataFrag_to_homeFrag)

        }

    }
}