/**
 * Copyright (C) 2010-2014 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.test15.roboguice;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EApplication;
import org.androidannotations.annotations.OrmLiteDao;
import org.androidannotations.test15.ebean.EmptyDependency;
import org.androidannotations.test15.ormlite.DatabaseHelper;
import org.androidannotations.test15.ormlite.User;
import org.androidannotations.test15.ormlite.UserDao;

import android.app.Application;

@EApplication
public class SampleRoboApplication extends Application {
	
	@Bean
	public EmptyDependency someDependency;

	@OrmLiteDao(helper = DatabaseHelper.class)
	UserDao userDao;

}
