package com.xtp.xclient.presenter.contract;

import com.xtp.xclient.library.mvp.BasePresenter;
import com.xtp.xclient.library.mvp.BaseView;
import com.xtp.xclient.model.bean.GankItemBean;

import java.util.List;

public interface GankContract {
    interface View extends BaseView {

        void showContent(List<GankItemBean> mList);

        void showMoreContent(List<GankItemBean> mList);

        void showGirlImage(String url, String copyright);
    }

    interface Presenter extends BasePresenter<View> {

        void getGankData(String tech, int type);

        void getMoreGankData(String tech);

        void getGirlImage();

    }
}
