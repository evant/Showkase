// This is an auto-generated file. Please do not edit/modify this file.
package com.airbnb.android.showkase_processor_testing

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.`annotation`.ShowkaseRootCodegen
import com.airbnb.android.showkase.models.ShowkaseBrowserColor
import com.airbnb.android.showkase.models.ShowkaseBrowserComponent
import com.airbnb.android.showkase.models.ShowkaseBrowserTypography
import com.airbnb.android.showkase.models.ShowkaseProvider
import kotlin.collections.List

@ShowkaseRootCodegen(
  numComposablesWithoutPreviewParameter = 1,
  numComposablesWithPreviewParameter = 0,
  numColors = 0,
  numTypography = 0
)
public class TestShowkaseRootCodegen : ShowkaseProvider {
  public val componentList: List<ShowkaseBrowserComponent> =
      mutableListOf<ShowkaseBrowserComponent>(
        ShowkaseBrowserComponent(
            group = "group",
            componentName = "TestComposable",
            componentKDoc = "",
            componentKey =
                """com.airbnb.android.showkase_processor_testing_null_group_TestComposable_null""",
            isDefaultStyle = false,
            component = @Composable { testComposable() })
      )

  public val colorList: List<ShowkaseBrowserColor> = listOf<ShowkaseBrowserColor>()

  public val typographyList: List<ShowkaseBrowserTypography> = listOf<ShowkaseBrowserTypography>()

  public override fun getShowkaseComponents() = componentList

  public override fun getShowkaseColors() = colorList

  public override fun getShowkaseTypography() = typographyList
}
