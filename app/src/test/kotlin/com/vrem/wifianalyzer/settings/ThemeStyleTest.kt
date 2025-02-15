/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2023 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.vrem.wifianalyzer.settings

import com.vrem.wifianalyzer.R
import org.junit.Assert.assertEquals
import org.junit.Test

class ThemeStyleTest {
    @Test
    fun testThemeStyle() {
        assertEquals(3, ThemeStyle.values().size)
    }

    @Test
    fun testTheme() {
        assertEquals(R.style.ThemeLight, ThemeStyle.LIGHT.theme)
        assertEquals(R.style.ThemeDark, ThemeStyle.DARK.theme)
        assertEquals(R.style.ThemeSystem, ThemeStyle.SYSTEM.theme)
    }

    @Test
    fun testThemeNoActionBar() {
        assertEquals(R.style.ThemeDarkNoActionBar, ThemeStyle.DARK.themeNoActionBar)
        assertEquals(R.style.ThemeLightNoActionBar, ThemeStyle.LIGHT.themeNoActionBar)
        assertEquals(R.style.ThemeSystemNoActionBar, ThemeStyle.SYSTEM.themeNoActionBar)
    }

}