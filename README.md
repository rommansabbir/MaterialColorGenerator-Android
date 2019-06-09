# Meterial Color Generator

## Documentation

### Installation
---
Step 1. Add the JitPack repository to your build file 

```gradle
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.rommansabbir:MaterialColorGenerator-Android:Tag'
  }
```

---

### Version available

| Releases        
| ------------- |
| v1.0-beta     |


# Usages

```kotlin
class MainActivity : AppCompatActivity(), FirebaseListenerKt.FirebaseListenerInterface{
    private lateinit var firebaseListenerKt : FirebaseListenerKt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //Get random color by passing the level you want
        MaterialColorGenerator.getRandomColor(50)
        
        //Set random color to any view by passing the color level & color set
        MaterialColorGenerator.setRandomColor(50, view)
    }
}
```

### Contact me
[Portfolio](https://www.rommansabbir.com/) | [LinkedIn](https://www.linkedin.com/in/rommansabbir/) | [Twitter](https://www.twitter.com/itzrommansabbir/) | [Facebook](https://www.facebook.com/itzrommansabbir/)

