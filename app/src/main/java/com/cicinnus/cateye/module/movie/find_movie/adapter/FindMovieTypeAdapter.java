package com.cicinnus.cateye.module.movie.find_movie.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cicinnus.cateye.R;
import com.cicinnus.cateye.module.movie.find_movie.bean.MovieTypeBean;

/**
 * Created by Cicinnus on 2017/2/2.
 */

public class FindMovieTypeAdapter extends BaseQuickAdapter<MovieTypeBean.DataBean.TagListBean,BaseViewHolder> {
    public FindMovieTypeAdapter() {
        super(R.layout.item_movie_type, null);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final MovieTypeBean.DataBean.TagListBean item) {
        helper.setText(R.id.tv_movie_type,item.getTagName());

    }
}