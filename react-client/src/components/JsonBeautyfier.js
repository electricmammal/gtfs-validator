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

import JSONPretty from 'react-json-prettify';
import React from "react";

/**
 * Used to beautify the content of a Json file
 * @param props :
    * - id: DOM element id
 *  * - className: the class name of the
 *  * - json: the json data to be transformed
 * @returns {JSX.Element}
 * @constructor
 */
const JsonBeautyfier = (props) => {

    return (
        <JSONPretty id={props.id} json={props.data} className={props.className}/>
    );
};
export default JsonBeautyfier;
