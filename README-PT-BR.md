# DataBinding
Android | Kotlin | Simple Example using DataBinding


# File: build.gradle:app

Starting from Android Gradle Plugin 4.0.0-alpha05 there is a new block called buildFeatures to enable build features.

So, instead of

android {
dataBinding{
    enabled = true
	}
}

We need to enable data binding like this, inside the buildFeatures block.

android {
    buildFeatures{
         dataBinding = true
    }
}

# Databinding Vs Kotlin Synthetic(KTX)

Kotlin Synthetic (KTX) can be used to avoid findViewById()  for smaller projects. It is very easy to use and really helpful in some situations.

But it is not a recommended best practice(by google) . Also you will miss a lot of advantages provided by data binding for larger complex projects. If you are planning to build an industrial level Android application with a proper architectural design, I highly recommend you to use data binding.

Recently Android has announced that with Kotlin 1.4.20, their Android Kotlin Extensions Gradle plugin will be deprecated and will no longer be shipped in the future Kotlin releases.

Some other benefits of Data binding.

1) Update the values automatically.(doesn’t have to keep track of all the ways a value can be updated)

2) Very effective for UI Testing.

3) More readable code.

4) More maintainable code.

5) Faster development times.

6) Faster execution times.

7) Well suited for MVVM and MVI architectures.

8) Errors can be found during the compile time.

9) No limitations comparing with Kotlin synthetic(Such as everything exists In a global namespace, typing Isn’t guaranteed,  nullability will not be exposed, ....)