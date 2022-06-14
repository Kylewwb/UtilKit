[![](https://jitpack.io/v/Kylewwb/UtilKit.svg)](https://jitpack.io/#Kylewwb/UtilKit)


# UtilKit 
工具类

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Kylewwb:UtilKit:1.0.8'
	}


### 说明： 

1.JsonUtil 将返回的Json数据转换为Map <br>

2 TimeUtils 验证码倒计时控件 <br>
用法：
```Android
  TimeUtils timeUtils = new TimeUtils(mTextViewSms, 60000, 1000);
  timeUtils.start();//开始倒计时
  timeUtils.cancel();//取消倒计时（可放在销毁中）
```

3 MyTextView 防止没有填充满就自动换行<br>
用法：
```Android
<com.kylewang.utils.utilskit.MyTextView
            android:id="@+id/index"
            android:layout_below="@+id/img"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:text="泰国进口泰国进口泰国进口泰国进口泰国进口泰国进口泰国进泰国进口泰国进泰国进口泰国进口"
            android:layout_gravity="center_horizontal"
            android:layout_marginLeft="30px"
            android:layout_alignParentLeft="true"
            android:layout_alignParentRight="true"
            android:layout_marginRight="30px"
            android:textColor="#333333"
            android:maxLines="2"
            android:ellipsize="end"
            android:textSize="12sp"/>
```
4  引入 compile 'com.blankj:utilcode:1.9.6' <br>

	https://www.jianshu.com/p/72494773aace
	
	
	持续更新中...
	
	

	    

