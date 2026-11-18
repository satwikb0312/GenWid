package com.opensource.genwid.widget

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.layout.Column
import androidx.glance.layout.padding
import androidx.glance.text.Text
import androidx.glance.unit.ColorProvider

class GenWidReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = GenWidWidget()
}

class GenWidWidget : GlanceAppWidget() {
    @Composable
    override fun Content() {
        Column(
            modifier = GlanceModifier.padding(8.dp)
        ) {
            Text(
                text = "GenWid Ready",
                style = androidx.glance.text.TextStyle(
                    color = ColorProvider(androidx.glance.unit.ColorProvider(android.graphics.Color.BLACK))
                )
            )
        }
    }
}
