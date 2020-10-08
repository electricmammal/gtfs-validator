/*
 *  Copyright (c) 2020. MobilityData IO.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import ReactDOM from "react-dom";
import JsonRenderer from "../components/JsonRenderer";
import React from "react";

/**
 * Enables a DOM element, if it is a dropzone user can drop files, else if it is a button, user can click on it
 * @param htmlId id of the DOM element to enable
 */
export function enableElement(htmlId) {
    document.getElementById(htmlId).removeAttribute("disabled");
}

/**
 * Disables a DOM element, if it is a dropzone user can no longer drop files, else if it is a button, user can no longer
 * click on it
 * @param htmlId id of the DOM element to disable
 */
export function disableElement(htmlId) {
    document.getElementById(htmlId).setAttribute("disabled", "true");
}

/**
 * Hides a DOM element
 * @param htmlId id of the DOM element to hide
 */
export function hideItem(htmlId) {
    document.getElementById(htmlId).style.visibility = "hidden";
}

/**
 * Shows a DOM element
 * @param htmlId id of the DOM element to hide
 */
export function showItem(htmlId) {
    document.getElementById(htmlId).style.visibility = "visible";
}

/**
 * Returns true if DOM element has an attribute, else returns false
 * @param htmlId      id of the DOM element
 * @param attribute   attribute to
 * @returns {boolean} true if DOM element has an attribute, else returns false
 */
export function hasAttribute(htmlId, attribute) {
    return document.getElementById(htmlId).hasAttribute(attribute);
}

/**
 * Displays Json file as a 2*n table
 * @param jsonData        data of the .json file
 * @param htmlDocumentId  DOM element id
 */
export function displayJsonData(jsonData, htmlDocumentId) {
    ReactDOM.render(
        <JsonRenderer data={jsonData} htmlId={htmlDocumentId}/>,
        document.getElementById(htmlDocumentId)
    );
}
