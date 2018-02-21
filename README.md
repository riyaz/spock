Java 8 Backport for Android
=========================

Java 8 [`java.util.function`](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) backport for Android.


Usage
-----

Refer original [Java docs](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) for usages, with only difference of base package name replaced with spock from java.

For eg, `java.util.function.Function` can be referenced with `spock.util.function.Function`

```java
import spock.util.Optional;

@Override public void onCreate() {
  super.onCreate();
  optTelephony = Optional.ofNullable(telephonyManager);
}
```


Why Spock?
------------

Android's [Java 8 support](https://developer.android.com/studio/write/java8-support.html#supported_features) does not include [java.util.function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) package for minSDK below 24. This library is an adoption of java.util.function package from [Android Source](https://android.googlesource.com/platform/libcore/+/master/ojluni) with some changes to support minSDK API level 15.


Download
--------

[ ![Download](https://api.bintray.com/packages/riyaz/me.riyaz/spock/images/download.svg) ](https://bintray.com/riyaz/me.riyaz/spock/_latestVersion)


```groovy
implementation 'me.riyaz:spock:<LATEST_VERSION>'

```



License
-------

GNU General Public License, version 2, with the Classpath Exception


