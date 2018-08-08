package com.kylewang.utils.utilskit;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;


/**
 * 验证码倒计时
 */

public class TimeUtils extends CountDownTimer {
    private TextView mTextView;

    public TimeUtils(TextView textView, long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
        this.mTextView = textView;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        //设置不可点击
        mTextView.setClickable(false);
        //设置倒计时时间
        mTextView.setText(millisUntilFinished / 1000 + "秒重新获取");
        mTextView.setTextColor(Color.RED);
//        mTextView.setBackgroundColor(Color.DKGRAY); //设置按钮为灰色，这时是不能点击的

        /**
         *获取按钮上的文字
         */
        SpannableString spannableString = new SpannableString(mTextView.getText().toString());
        ForegroundColorSpan span = new ForegroundColorSpan(Color.RED);
        /**
         *
         * 主要是start跟end，start是起始位置,无论中英文，都算一个。
         * 从0开始计算起。end是结束位置，所以处理的文字，包含开始位置，但不包含结束位置。
         * //将倒计时的时间设置为你要的颜色
         */
        spannableString.setSpan(span, 0, 2, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        mTextView.setText(spannableString);
    }

    @Override
    public void onFinish() {
        mTextView.setText("获取验证码");
        //重新获得点击
        mTextView.setClickable(true);
//        mTextView.setBackgroundColor(Color.rgb(242, 80, 0));//还原背景色
    }
}
