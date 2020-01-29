To reproduce bug, simply run the ```DeepLinkTest.kt``` instrumentation
test on a device and wait for about 30 seconds or so. You should see the following error:

```

E/TestRunner: failed: it_should_assert_app_link_launches_main_activity(com.example.applinkscenariotest.AppLinkTest)
    ----- begin exception -----
E/TestRunner: java.lang.AssertionError: Activity never becomes requested state "[CREATED, STARTED, RESUMED, DESTROYED]" (last lifecycle transition = "PRE_ON_CREATE")
        at androidx.test.core.app.ActivityScenario.waitForActivityToBecomeAnyOf(ActivityScenario.java:301)
        at androidx.test.core.app.ActivityScenario.launchInternal(ActivityScenario.java:235)
        at androidx.test.core.app.ActivityScenario.launch(ActivityScenario.java:209)
        at com.example.applinkscenariotest.AppLinkTest.it_should_assert_app_link_launches_main_activity(AppLinkTest.kt:25)
        at java.lang.reflect.Method.invoke(Native Method)
        at java.lang.reflect.Method.invoke(Method.java:372)
        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
        at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
        at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
        at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at androidx.test.ext.junit.runners.AndroidJUnit4.run(AndroidJUnit4.java:104)
        at org.junit.runners.Suite.runChild(Suite.java:128)
        at org.junit.runners.Suite.runChild(Suite.java:27)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
        at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
        at androidx.test.internal.runner.TestExecutor.execute(TestExecutor.java:56)
        at androidx.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:392)
        at android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1837)
    ----- end exception -----
``` 