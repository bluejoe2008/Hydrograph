/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package hydrograph.ui.dataviewer.actions;

import hydrograph.ui.dataviewer.utilities.DataViewerUtility;
import hydrograph.ui.dataviewer.window.DebugDataViewer;

import org.eclipse.jface.action.Action;

/**
 * The Class ResetSortAction
 * Responsible for resetting the sorting applied in view data window.
 * 
 * @author Bitwise
 *
 */
public class ResetSortAction extends Action {

	private DebugDataViewer debugDataViewer;
	private static final String LABEL = "Re&set Sort";
	public ResetSortAction(DebugDataViewer debugDataViewer) {
		super(LABEL);
		this.debugDataViewer = debugDataViewer;
	}

	@Override
	public void run() {
		DataViewerUtility.INSTANCE.resetSort(debugDataViewer);
		debugDataViewer.redrawTableCursor();
	}
}
