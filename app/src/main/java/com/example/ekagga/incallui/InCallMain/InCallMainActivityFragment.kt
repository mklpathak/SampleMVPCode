package com.example.ekagga.incallui.InCallMain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ekagga.incallui.BaseFragment
import com.example.ekagga.incallui.R

// Your presenter is available using the mPresenter variable
public class InCallMainActivityFragment : BaseFragment(), InCallMainActivityContract.View {

    private var mPresenter: InCallMainActivityContract.Presenter? = null

   override fun setPresenter(presenter: InCallMainActivityContract.Presenter) {
        this.mPresenter = presenter
    }

   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_in_call_main_layout, container, false)
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnInCallMainActivityFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onInCallMainActivityFragmentInteraction()
    }

    companion object {

        @JvmStatic
       public fun newInstance(): InCallMainActivityFragment {
            return InCallMainActivityFragment()
        }
    }
}// Required empty public constructor
