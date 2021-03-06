package com.mymxhbyf.dongjk.latte.ec.main.sort;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.mymxhbyf.dongjk.latte.ec.R;
import com.mymxhbyf.dongjk.latte.ec.main.sort.content.ContentDelegate;
import com.mymxhbyf.dongjk.latte.ec.main.sort.list.VerticalListDelegate;
import com.mymxhbyf.dongjk.lattecore.delegates.bottom.BottomItemDelegate;

/**
 * 分类页面
 * Created by DongJK on 2018/1/29.
 */

public class SortDelegate extends BottomItemDelegate{
    @Override
    public Object setLayout() {
        return R.layout.delegate_sort;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        final VerticalListDelegate listDelegate = new VerticalListDelegate();
        getSupportDelegate().loadRootFragment(R.id.vertical_list_container,listDelegate);
        //设置右侧第一个分类显示，默认显示
        getSupportDelegate().loadRootFragment(R.id.sort_content_container, ContentDelegate.newInstance(1));
    }
}
