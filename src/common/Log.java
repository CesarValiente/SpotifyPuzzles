/*
 *   Copyright (C) 2013  Cesar Valiente Gordo (cesar.valiente@gmail.com)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

package common;

/**
 * 
 * @author cesar.valiente@gmail.com
 * 
 *         This class is used to manage the app logs
 * 
 */
public class Log {

    /**
     * 
     * @param message
     */
    public static void v(final String message) {
        System.out.println(message);
    }

    /**
     * 
     * @param className
     * @param message
     */
    public static void d(final String className, final String message) {
        if (CommonConstants.DEBUG) {
            System.out.println(className + "\n" + message);
        }
    }

    /**
     * 
     * @param message
     */
    public static void d(final String message) {
        if (CommonConstants.DEBUG) {
            System.out.println(message);
        }
    }

    /**
     * 
     * @param className
     * @param e
     * @see Exception
     * @param message
     */
    public static void e(final String className, final Exception e,
            final String message) {
        if (CommonConstants.DEBUG) {
            e.printStackTrace();
            System.out.println(className + "\n" + message);
        }
    }

    /**
     * 
     * @param e
     * @see Exception
     * @param message
     */
    public static void e(final Exception e, final String message) {
        if (CommonConstants.DEBUG) {
            e.printStackTrace();
            System.out.println(message);
        }
    }

}
