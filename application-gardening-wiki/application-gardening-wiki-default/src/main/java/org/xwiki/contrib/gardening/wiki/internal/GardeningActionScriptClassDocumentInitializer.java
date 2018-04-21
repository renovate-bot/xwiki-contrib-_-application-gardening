/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.gardening.wiki.internal;

import java.util.Arrays;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.model.reference.LocalDocumentReference;

import com.xpn.xwiki.doc.AbstractMandatoryClassInitializer;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;

/**
 * Define the GardeningActionScriptClass XClass.
 *
 * @version $Id$
 * @since 1.0
 */
@Component
@Named("Gardening.Code.GardeningActionScriptClass")
@Singleton
public class GardeningActionScriptClassDocumentInitializer extends AbstractMandatoryClassInitializer
{
    /**
     * The name of the space where the class is located.
     */
    private static final List<String> SPACE_PATH = Arrays.asList("Gardening", "Code");

    /**
     * Default constructor.
     */
    public GardeningActionScriptClassDocumentInitializer()
    {
        super(new LocalDocumentReference(SPACE_PATH, "GardeningActionScriptClass"));
    }

    @Override
    protected void createClass(BaseClass xclass)
    {
        xclass.addTextField("name", "Name", 64);
        xclass.addTextField("id", "Identifier", 64);
        xclass.addTextAreaField("description", "Description", 40, 3);
        xclass.addTextAreaField("content", "Content",
                40, 3, TextAreaClass.ContentType.VELOCITY_CODE);
    }
}
