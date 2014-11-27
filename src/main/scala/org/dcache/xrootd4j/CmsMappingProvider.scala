/**
 * Copyright (C) 2011-2014 dCache.org <support@dcache.org>
 *
 * This file is part of xrootd4j-cms-plugin.
 *
 * xrootd4j-cms-plugin is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * xrootd4j-cms-plugin is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with xrootd4j-cms-plugin.  If not, see
 * <http://www.gnu.org/licenses/>.
 */
package org.dcache.xrootd4j

import java.util.Properties

import org.dcache.xrootd.plugins.AuthorizationProvider

class CmsMappingProvider extends AuthorizationProvider
{
    override def createFactory(plugin : String, properties : Properties) : CmsMappingFactory =
    {
        if (CmsMappingFactory hasName plugin) new CmsMappingFactory(properties) else null
    }
}
