package com.anand.navigationgraph


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnSubmit.setOnClickListener {

            val text = input_box.text.toString()

            //we dont need to do any fragment transaction and bla bla bla
            //jst the below lines of code

            //first after we create the navigation graph, we need to rebuild the project, as the compiler will generate some dynamic class files
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(text)) //only this line is for fragments, no need of doing any fragment transaction


        }

    }

}
