package com.example.ekagga.incallui.InCallMain

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.ekagga.incallui.BaseActivity
import com.example.ekagga.incallui.R

//todo create BaseActivity and import to this class
class InCallMainActivityActivity : BaseActivity(), InCallMainActivityFragment.OnInCallMainActivityFragmentInteractionListener {

    internal lateinit var mPresenter: InCallMainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_in_call_main_layout)

        var inCallMainActivityFragment: InCallMainActivityFragment? = getSupportFragmentManager().findFragmentById(R.id.frame_layout_content) as InCallMainActivityFragment?
        if (inCallMainActivityFragment == null) {
            inCallMainActivityFragment = InCallMainActivityFragment.newInstance()
            val transaction = getSupportFragmentManager().beginTransaction()
            transaction.add(R.id.frame_layout_content, inCallMainActivityFragment)
            transaction.commit()
        }
        mPresenter = InCallMainActivityPresenter(this, inCallMainActivityFragment)
    }

    override fun onStart() {
        super.onStart()
        mPresenter.start()
    }

    override fun onStop() {
        super.onStop()
        mPresenter.stop()
    }

    override fun onInCallMainActivityFragmentInteraction() {

    }
}
