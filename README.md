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
	        implementation 'com.github.Kylewwb:UtilKit:1.0.1'
	}


### 说明： 

1.JsonUtil 将返回的Json数据转换为Map
2 TimeUtils 验证码倒计时控件
用法：
```Android
  TimeUtils timeUtils = new TimeUtils(mTextViewSms, 60000, 1000);
  timeUtils.start();//开始倒计时
  timeUtils.cancel();//取消倒计时（可放在销毁中）
```
