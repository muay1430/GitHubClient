package mustafaozhan.github.com.githubclient.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.annotation.MenuRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Mustafa Ozhan on 2018-07-22.
 */
abstract class BaseFragment : Fragment() {

    val fragmentTag: String = this.javaClass.simpleName

    @LayoutRes
    protected abstract fun getLayoutResId(): Int

    @MenuRes
    open var menuResID: Int? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutResId(), container, false)
    }

    protected fun replaceFragment(fragment: BaseFragment, withBackStack: Boolean) {
        getBaseActivity().replaceFragment(fragment, withBackStack)
    }

    protected fun getBaseActivity(): BaseActivity = activity as BaseActivity

}