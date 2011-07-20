/*
* Copyright (C) 2011 Dominik Schürmann <dominik@dominikschuermann.de>
*
* This file is part of AdAway.
* 
* AdAway is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* AdAway is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with AdAway.  If not, see <http://www.gnu.org/licenses/>.
*
*/

package org.adaway;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {
    public final static String PREFS_NAME = "preferences";

    public static boolean getHttps(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        return prefs.getBoolean(context.getString(R.string.pref_key_https),
                Boolean.parseBoolean(context.getString(R.string.pref_def_https)));
    }

    public static boolean getCheckSyntax(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        return prefs.getBoolean(context.getString(R.string.pref_key_check_syntax),
                Boolean.parseBoolean(context.getString(R.string.pref_def_check_syntax)));

    }

    public static String getRedirectionIP(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        return prefs.getString(context.getString(R.string.pref_redirection_ip),
                context.getString(R.string.pref_def_redirection_ip));
    }
}