// This is an auto-generated file. Please do not edit/modify this file.
package com.airbnb.android.showkase_processor_testing

import android.Manifest
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.rule.GrantPermissionRule
import com.airbnb.android.showkase.models.Showkase
import com.airbnb.android.showkase_processor_testing.getMetadata
import kotlin.Unit
import kotlin.jvm.JvmField
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
public class MyScreenshotTest_ShowkaseCodegen : MyScreenshotTest() {
  @get:Rule
  public override val composeTestRule: ComposeContentTestRule = createComposeRule()

  @Rule
  @JvmField
  public val permissionRule: GrantPermissionRule = GrantPermissionRule.grant(
       Manifest.permission.WRITE_EXTERNAL_STORAGE,
       Manifest.permission.READ_EXTERNAL_STORAGE 
      )

  @Test
  public fun composable_screenshot_test_0(): Unit {
    takeComposableScreenshot(Showkase.getMetadata().componentList[0])
  }

  @Test
  public fun composable_screenshot_test_1(): Unit {
    takeComposableScreenshot(Showkase.getMetadata().componentList[1])
  }
}
