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
 * Use the [LoginFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFrag : Fragment() {
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
        return inflater.inflate(R.layout.fragment_login2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ETemail = view.findViewById<EditText>(R.id.email)
        val ETpassword = view.findViewById<EditText>(R.id.password)
        val btnLogin = view.findViewById<Button>(R.id.btnlogin)

        btnLogin.setOnClickListener {
            if (ETemail.text.toString().contains("putrasenja@gmail.com") && ETpassword.text.toString().contains("123")){
                Toast.makeText(context, "Login Berhasil", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_loginFrag_to_homeFrag)
            }else{
                Toast.makeText(context,"Email atau Password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}