package com.example.datapegawainew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFrag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSubmit = view.findViewById<Button>(R.id.btnsubmit)
        btnSubmit.setOnClickListener {
            val nik = view.findViewById<EditText>(R.id.inpnik).text.toString()
            val nama = view.findViewById<EditText>(R.id.inpnama).text.toString()
            val status = view.findViewById<EditText>(R.id.inpstatus).text.toString()
            val pekerjaan = view.findViewById<EditText>(R.id.inpkerja).text.toString()

            if (nik.equals("") || nama.equals("") || status.equals("") || pekerjaan.equals("")){
                Toast.makeText(context,"Data Tidak Lengkap !!Silahkan Lengkapi Data Jika Ingin Pinjol", Toast.LENGTH_SHORT).show()
            }else{
                val bundle = Bundle()
                bundle.putString("keynik",nik)
                bundle.putString("keynama",nama)
                bundle.putString("keystatus",status)
                bundle.putString("keypekerjaan",pekerjaan)

                Toast.makeText(context,"Submit Berhasil", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_homeFrag_to_dataFrag, bundle)

            }
        }
    }
}