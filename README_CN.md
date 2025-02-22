# BannerViewPager

[![License](https://img.shields.io/badge/License%20-Apache%202-337ab7.svg)](https://www.apache.org/licenses/LICENSE-2.0)
![MinSdk](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)
[![JitPack](https://jitpack.io/v/zhpanvip/BannerViewPager.svg)](https://jitpack.io/#zhpanvip/BannerViewPager)
[ ![JCenter](https://api.bintray.com/packages/zhpanvip/CircleViewPager/bannerview/images/download.svg) ](https://bintray.com/zhpanvip/CircleViewPager/bannerview/_latestVersion)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-BannerViewPager-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7961)

## [English](https://github.com/zhpanvip/BannerViewPager) | 中文


> 腾讯视频、QQ音乐、酷狗音乐、支付宝、天猫、淘宝、优酷视频、喜马拉雅、网易云音乐、哔哩哔哩、全民K歌等App的Banner样式都可以通过BannerViewPager实现哦！


## 效果预览

 ### [点击或扫描二维码下载apk](https://github.com/zhpanvip/BannerViewPager/raw/master/download/app.apk)

![扫描下载Demo](https://github.com/zhpanvip/BannerViewPager/blob/master/image/qrcode.png)


### 1.setPageStyle

[一屏多页Demo](https://github.com/zhpanvip/BannerViewPager/blob/master/app/src/main/java/com/example/zhpan/circleviewpager/fragment/PageFragment.java)

| MULTI_PAGE |MULTI_PAGE_SCALE | MULTI_PAGE_OVERLAP |
|--|--|--|
| ![MULTI_PAGE](https://github.com/zhpanvip/BannerViewPager/blob/master/image/page_style_multi.gif) |![MULTI_PAGE](https://github.com/zhpanvip/BannerViewPager/blob/master/image/page_style_multi_scale.gif) |![MULTI_PAGE](https://github.com/zhpanvip/BannerViewPager/blob/master/image/page_style_multi_overlay.gif) |

### 2.setIndicatorStyle
BannerViewPager支持多种IndicatorViewStyle,同时还提供了完全自定义IndicatorView的功能。只要继承BaseIndicatorView或者实现IIndicator接口，并重写相应方法，就可以为所欲为的打造任意的Indicator了。

[IndicatorViewStyle Demo](https://github.com/zhpanvip/BannerViewPager/blob/master/app/src/main/java/com/example/zhpan/circleviewpager/fragment/IndicatorFragment.java)

| CIRCLE | DASH | ROUND_RECT |
|--|--|--|
| ![CIRCLE](https://github.com/zhpanvip/BannerViewPager/blob/master/image/style_circle.gif) | ![DASH](https://github.com/zhpanvip/BannerViewPager/blob/master/image/style_dash.gif) | ![NORMAL](https://github.com/zhpanvip/BannerViewPager/blob/master/image/style_round_rect.gif) |

### 3.setIndicatorSlideMode

| NORMAL | SMOOTH |
|--|--|
| ![NORMAL](https://github.com/zhpanvip/BannerViewPager/blob/master/image/slide_normal.gif) |  ![SMOOTH](https://github.com/zhpanvip/BannerViewPager/blob/master/image/slide_smooth.gif) |


### 4.setPageTransformerStyle

[TransformStyle Demo](https://github.com/zhpanvip/BannerViewPager/blob/master/app/src/main/java/com/example/zhpan/circleviewpager/activity/WelcomeActivity.java)

| 参数 | STACK | ROTATE | DEPTH | ACCORDION |
|--|--|--|--|--|
| 预览 | ![STACK](https://github.com/zhpanvip/BannerViewPager/blob/master/image/transform_stack.gif) | ![ROTATE_DOWN](https://github.com/zhpanvip/BannerViewPager/blob/master/image/transform_rotate.gif) | ![DEPTH](https://github.com/zhpanvip/BannerViewPager/blob/master/image/transform_depth.gif)  |![ACCORDION](https://github.com/zhpanvip/BannerViewPager/blob/master/image/transform_accordion.gif)  |



## 开放API

| 方法名 | 方法描述 | 说明 |
|--|--|--|
| BannerViewPager<T, VH> setCanLoop(boolean canLoop) | 是否开启循环 | 默认值true|
| BannerViewPager<T, VH> setAutoPlay(boolean autoPlay) | 是否开启自动轮播 | 默认值true|
| BannerViewPager<T, VH> setInterval(int interval) | 自动轮播时间间隔 |单位毫秒，默认值3000  |
| BannerViewPager<T, VH> setScrollDuration(int scrollDuration) | 设置页面滚动时间 | 设置页面滚动时间 |单位毫秒，默认值500  |
| BannerViewPager<T, VH> setRoundCorner(int radius) | 设置圆角 |默认无圆角 需要SDK_INT>=LOLLIPOP(API 21)  |
| BannerViewPager<T, VH> setOnPageClickListener(OnPageClickListener onPageClickListener) | 设置页面点击事件 |  |
| BannerViewPager<T, VH> setHolderCreator(HolderCreator\<VH> holderCreator) |设置HolderCreator  |必须设置HolderCreator，否则会抛出NullPointerException|
| BannerViewPager<T, VH> setIndicatorVisibility(@Visibility int visibility) | indicator visibility |默认值VISIBLE 2.4.2 新增|
| BannerViewPager<T, VH> setIndicatorStyle(int indicatorStyle) | 设置指示器样式 | 可选枚举(CIRCLE, DASH、ROUND_RECT) 默认CIRCLE  |
| BannerViewPager<T, VH> setIndicatorGravity(int gravity) | 指示器位置 |可选值(CENTER、START、END)默认值CENTER |
| BannerViewPager<T, VH> setIndicatorColor(int normalColor,int checkedColor) | 指示器圆点颜色 |normalColor：未选中时颜色默认"#8C6C6D72"， checkedColor：选中时颜色 默认"#8C18171C" |
| BannerViewPager<T, VH> setIndicatorSlideMode(int slideMode)  | 设置Indicator滑动模式 | 可选（NORMAL、SMOOTH），默认值NORMAL  |
| BannerViewPager<T, VH> setIndicatorRadius(int radius) | 设置指示器圆点半径 | 默认值4dp|
| BannerViewPager<T, VH> setIndicatorRadius(int normalRadius,int checkRadius)  |设置指示器圆点半径  |  normalRadius:未选中时半径  checkedRadius:选中时的半径,默认值4dp |
| BannerViewPager<T, VH> setIndicatorWidth(int indicatorWidth) | 设置指示器宽度，如果是圆形指示器，则为直径 |  默认值8dp|
| BannerViewPager<T, VH> setIndicatorWidth(int normalWidth, int checkWidth) | 设置指示器宽度，如果是圆形指示器，则为直径 | 默认值8dp |
| BannerViewPager<T, VH> setIndicatorHeight(int indicatorHeight) | 设置指示器高度，仅在Indicator样式为DASH时有效 | 默认值normalIndicatorWidth/2 |
| BannerViewPager<T, VH> setIndicatorGap(int indicatorMargin) | 指示器圆点间距| 默认值为指示器宽度（或者是圆的直径）|
| BannerViewPager<T, VH> setIndicatorView(IIndicator indicatorView) | 设置自定义指示器|自定义View需要继承BaseIndicatorView或实现IIndicator |
| BannerViewPager<T, VH> setPageTransformerStyle(int style) | 设置页面Transformer内置样式 |  |
| BannerViewPager<T, VH> setCurrentItem(int item) | Set the currently selected page. | 2.3.5新增 |
| int getCurrentItem() | 获取当前position | 2.3.5新增 |
| BannerViewPager<T, VH> setPageStyle(PageStyle pageStyle) | 设置页面样式 | 2.4.0新增 可选（MULTI_PAGE、MULTI_PAGE_SCALE、MULTI_PAGE_OVERLAP）|
| BannerViewPager<T, VH> setPageMargin(int pageMargin) | 设置页面间隔 | 2.4.0新增 |
| BannerViewPager<T, VH> setIndicatorMargin(int left, int top, int right, int bottom) | 设置Indicator边距 | 2.4.1新增 |
| BannerViewPager<T, VH> setOnPageChangeListener(OnPageChangeListener l) | 页面改变的监听事件 | 2.4.3新增 |
| void startLoop() |开启自动轮播 | 初始化BannerViewPager时不必调用该方法,设置setAutoPlay后会调用startLoop() |
| void stopLoop() | 停止自动轮播 | |
| List\<T> getList() | 获取Banner中的集合数据 |  |
| void create(List<T> list) |初始化并构造BannerViewPager  |必须调用，否则前面设置的参数无效  |

### xml支持的attrs
| Attributes | format | description |
|--|--|--|
| bvp_interval | integer | 自动轮播时间间隔 |
| bvp_scroll_duration | integer | 页面切换时滑动时间|
| bvp_can_loop | boolean| 是否循环 |
| bvp_auto_play | boolean | 是否自动播放  |
| bvp_indicator_checked_color | color | indicator选中时颜色 |
| bvp_indicator_normal_color | color | indicator未选中时颜色 |
| bvp_indicator_radius | dimension | indicator圆点半径或者Dash模式的1/2宽度  |
| bvp_round_corner| dimension  | Banner圆角大小 |
| bvp_page_margin | dimension | 页面item间距 |
| bvp_reveal_width | dimension | 一屏多页模式下两边item漏出的宽度 |
| bvp_indicator_style | enum | indicator样式(circle/dash)  |
| bvp_indicator_slide_mode | enum | indicator滑动模式(normal/smooth) |
| bvp_indicator_gravity | enum | indicator位置(center/start/end) |
| bvp_page_style | enum | page样式(normal/multi_page/multi_page_overlap/multi_page_scale) |
| bvp_transformer_style | enum | transform样式(normal/depth/stack/accordion) |
| bvp_indicator_visibility| enum | indicator visibility(visible/gone/invisible) |


## 如何使用

### 1.gradle中添加依赖
   

如果您已迁移到AndroidX，请在项目的root build.gradle中添加如下配置：
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
```
Add the dependency

```
implementation 'com.github.zhpanvip:BannerViewPager:latestVersion'

```

Androidx latestVersion:[![latestVersion](https://jitpack.io/v/zhpanvip/BannerViewPager.svg)](https://jitpack.io/#zhpanvip/BannerViewPager)

如果你仍在使用Android support请使用（非Androidx的包托管在JCenter上）：
```
implementation 'com.zhpan.library:bannerview:latestVersion'
```

Android support latestVersion: [ ![latestVersion](https://api.bintray.com/packages/zhpanvip/CircleViewPager/bannerview/images/download.svg) ](https://bintray.com/zhpanvip/CircleViewPager/bannerview/_latestVersion)

### 2.在xml文件中添加如下代码：

```
    <com.zhpan.bannerview.BannerViewPager
            android:id="@+id/banner_view"
            android:layout_width="match_parent"
            android:layout_margin="10dp"
            android:layout_height="160dp" />
```

### 3.Banner的Item页面布局

```
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <ImageView
            android:id="@+id/banner_image"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:scaleType="centerCrop" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:background="#66000000"
            android:gravity="center_vertical">

            <TextView
                android:id="@+id/tv_describe"
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_gravity="center_vertical"
                android:layout_marginStart="15dp"
                android:gravity="center_vertical"
                android:paddingTop="5dp"
                android:paddingBottom="5dp"
                android:textColor="#FFFFFF"
                android:textSize="16sp" />
        </LinearLayout>

    </RelativeLayout>
```

### 4.自定义ViewHolder,自定义的ViewHolder需要实现com.zhpan.bannerview.holder.ViewHolder接口

```
    public class NetViewHolder implements ViewHolder<CustomBean> {

        @Override
        public int getLayoutId() {
            return R.layout.item_net;
        }

        @Override
        public void onBind(View itemView, CustomBean data, int position, int size) {
            CornerImageView imageView = itemView.findViewById(R.id.banner_image);
            imageView.setRoundCorner(imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.dp_5));
            ImageLoaderOptions options = new ImageLoaderOptions.Builder()
                    .into(imageView).load(data.getImageRes())
                    .placeHolder(R.drawable.placeholder).build();
            ImageLoaderManager.getInstance().loadImage(options);
        }
    }
```

### 5.BannerViewPager参数配置

Kotlin：

```
    private lateinit var mViewPager: BannerViewPager<CustomBean, NetViewHolder>

    private fun initViewPager() {
            mBannerViewPager = findViewById(R.id.banner_view)
            mBannerViewPager.setCanLoop(false)
                .setIndicatorSlideMode(IndicatorSlideMode.SMOOTH)
                .setIndicatorMargin(0, 0, 0, getResources().getDimensionPixelOffset(R.dimen.dp_40))
                .setIndicatorGravity(IndicatorGravity.CENTER)
                .setHolderCreator { NetViewHolder() }
                .setOnPageChangeListener(
                    object : OnPageChangeListenerAdapter() {
                        override fun onPageSelected(position: Int) {
                            pageSelect(position)
                        }
                    }
                )
                .create(res.toList())
        }
```

Java：

```
    private BannerViewPager<CustomBean, NetViewHolder> mBannerViewPager;
    ...
	private void initViewPager() {
             mBannerViewPager = findViewById(R.id.banner_view);
             mBannerViewPager.showIndicator(true)
                .setInterval(3000)
                .setCanLoop(false)
                .setAutoPlay(true)
                .setRoundCorner(getResources().getDimensionPixelOffset(R.dimen.dp_7))
                .setIndicatorColor(Color.parseColor("#935656"), Color.parseColor("#FF4C39"))
                .setIndicatorGravity(IndicatorGravity.END)
                .setScrollDuration(1000).setHolderCreator(NetViewHolder::new)
                .setOnPageClickListener(position -> {
                    CustomBean bannerData = mBannerViewPager.getList().get(position);
                    Toast.makeText(NetworkBannerActivity.this,
                            "点击了图片" + position + " " + bannerData.getImageDescription(), Toast.LENGTH_SHORT).show();

                }).create(mList);
        }
```
### 6.开启与停止轮播

***2.5.0之后版本无需自行在Activity或Fragment中管理stopLoop和startLoop方法，但这两个方法依旧保留对外开放***

但是为了节省性能建议在onPause中停止轮播，在onResume中开启轮播：

```
     @Override
      public void onPause() {
          super.onPause();
          if (mViewPager != null) {
              mViewPager.stopLoop();
          }
      }

    @Override
    protected void onResume() {
        super.onResume();
        if (mBannerViewPager != null)
            mBannerViewPager.startLoop();
    }
```

### 7.高级功能---自定义IndicatorView

在内置Indicator不满足需求时可以通过自定义IndicatorView实现,例子将实现一个如下图所示的IndicatorView。

| Custom IndicatorView|
|--|
| ![NORMAL](https://github.com/zhpanvip/BannerViewPager/blob/master/image/style_custum.gif) |

**(1)自定义View并继承BaseIndicatorView**

```
public class FigureIndicatorView extends BaseIndicatorView {

    private int radius = DpUtils.dp2px(20);

    private int backgroundColor = Color.parseColor("#88FF5252");

    private int textColor = Color.WHITE;

    private int textSize=DpUtils.dp2px(13);

    public FigureIndicatorView(Context context) {
        this(context, null);
    }

    public FigureIndicatorView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FigureIndicatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(2 * radius, 2 * radius);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(backgroundColor);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, radius, mPaint);
        mPaint.setColor(textColor);
        mPaint.setTextSize(textSize);
        String text = currentPosition + 1 + "/" + pageSize;
        int textWidth = (int) mPaint.measureText(text);
        Paint.FontMetricsInt fontMetricsInt = mPaint.getFontMetricsInt();
        int baseline = (getMeasuredHeight() - fontMetricsInt.bottom + fontMetricsInt.top) / 2 - fontMetricsInt.top;
        canvas.drawText(text, (getWidth() - textWidth) / 2, baseline, mPaint);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void setBackgroundColor(@ColorInt int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }
}
```
**(2)设置自定义指示器**

```
    FigureIndicatorView indicatorView = new FigureIndicatorView(mContext);
    indicatorView.setRadius(BannerUtils.dp2px(18));
    indicatorView.setTextSize(BannerUtils.dp2px(13));
    indicatorView.setBackgroundColor(Color.parseColor("#aa118EEA"));

    mViewPager.setIndicatorGravity(IndicatorGravity.END)
              .setIndicatorView(indicatorView)
              .setHolderCreator(() -> new ImageResourceViewHolder(0))
              .create(mDrawableList);
```

## TODO 版本计划

 - [x] 优化及重构IndicatorView（2.0.1）

 - [x] 修复2.1.0以前版本循环滑动时第一张切换卡顿问题（2.1.0.1）

 - [x] 增加页面滑动动画（2.1.2）

 - [x] 迁移AndroidX（2.2.0）

 - [x] 增加IndicatorView的滑动样式（2.2.2）

 - [x] 增添更多Indicator样式（2.3.+）
 - [x] 支持一屏显示多页 （2.4.0）
 - [x] v2.4.3版本着重优化提升性能
 - [x] 重构Indicator，~~尽量修复Indicator SMOOTH模式下滑动问题~~ (2.5.0)
 - [x] 目前Indicator部分代码比较乱，还有很大很大的优化空间，后续版本将持续优化(2.5.0对Indicator再次进行了重构，重构后代码已经很整洁，但仍然有优化空间)
 - [x] 修复 issue #34 Indicator 在Smooth模式下存在的问题 (2.6.1).
 - [ ] ViewPager更换为ViewPager2 （3.0.0）


## 有问题可以扫码加QQ群交流

 ![QQ交流群60902509](https://github.com/zhpanvip/BannerViewPager/blob/master/image/qq_group.png)


##  更多详情请参看以下链接

[《打造一个丝滑般自动轮播无限循环Android库》](https://juejin.im/post/5d6bce24f265da03db0790d1)

[《BannerViewPager源码解析》](https://juejin.im/post/5d74d3faf265da03b5747015)

[《剖析BannerViewPager中Indicator的设计思想》](https://juejin.im/post/5dda0b6d518825731f569a8c)

## 感谢

[banner](https://github.com/youth5201314/banner)

[Android-ConvenientBanner](https://github.com/saiwu-bigkoo/Android-ConvenientBanner)

[ViewPagerTransforms](https://github.com/ToxicBakery/ViewPagerTransforms)

[玩Android](https://wanandroid.com/)


License
-------

    Copyright 2019 zhpanvip

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.






