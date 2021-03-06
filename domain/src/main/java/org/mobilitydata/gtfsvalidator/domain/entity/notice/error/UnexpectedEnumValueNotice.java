/*
 * Copyright (c) 2020. MobilityData IO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mobilitydata.gtfsvalidator.domain.entity.notice.error;

import org.mobilitydata.gtfsvalidator.domain.entity.notice.NoticeExporter;
import org.mobilitydata.gtfsvalidator.domain.entity.notice.base.ErrorNotice;

import java.io.IOException;

public class UnexpectedEnumValueNotice extends ErrorNotice {

    public UnexpectedEnumValueNotice(final String filename, final String fieldName, final String entityId,
                                     final Object enumValue) {
        super(filename, E_021,
                "Unexpected enum value",
                "Invalid value :`" + enumValue + "` - for field:`" + fieldName + "` in file:`" + filename +
                        "` for entity with id:`" + entityId + "`", entityId);
        putNoticeSpecific(KEY_FIELD_NAME, fieldName);
        putNoticeSpecific(KEY_ENUM_VALUE, enumValue);
    }

    /**
     * Notice alternative constructor handling entities with no id, but a composite key made of 2 elements
     *
     * @param filename                the name of the file
     * @param fieldName               the name of the field
     * @param enumValue               the enum value provided
     * @param compositeKeyFirstPart   the "title" of the first part of the composite key
     * @param compositeKeySecondPart  the "title" of the second part of the composite key
     * @param compositeKeyFirstValue  the value of the first part of the composite key
     * @param compositeKeySecondValue the value of the second part of the composite key
     */
    public UnexpectedEnumValueNotice(final String filename, final String fieldName,
                                     final Integer enumValue, final String compositeKeyFirstPart,
                                     final String compositeKeySecondPart, final Object compositeKeyFirstValue,
                                     final Object compositeKeySecondValue) {
        super(filename, E_021,
                "Unexpected enum value",
                "Invalid value :`" + enumValue + "` - for field:`" + fieldName + "` in file:`" + filename +
                        "` for entity with composite id:`" + compositeKeyFirstValue + "`+`" + compositeKeySecondPart
                        + "`", null);
        putNoticeSpecific(KEY_FIELD_NAME, fieldName);
        putNoticeSpecific(KEY_ENUM_VALUE, enumValue);
        putNoticeSpecific(KEY_COMPOSITE_KEY_FIRST_PART, compositeKeyFirstPart);
        putNoticeSpecific(KEY_COMPOSITE_KEY_SECOND_PART, compositeKeySecondPart);
        putNoticeSpecific(KEY_COMPOSITE_KEY_FIRST_VALUE, compositeKeyFirstValue);
        putNoticeSpecific(KEY_COMPOSITE_KEY_SECOND_VALUE, compositeKeySecondValue);
    }

    /**
     * Notice alternative constructor handling entities with no id, but a composite key made of 4 elements
     *
     * @param filename                the name of the file
     * @param fieldName               the name of the field
     * @param enumValue               the enum value provided
     * @param compositeKeyFirstPart   the "title" of the first part of the composite key
     * @param compositeKeySecondPart  the "title" of the second part of the composite key
     * @param compositeKeyThirdPart   the "title" of the third part of the composite key
     * @param compositeKeyFourthPart  the "title" of the fourth part of the composite key
     * @param compositeKeyFirstValue  the value of the first part of the composite key
     * @param compositeKeySecondValue the value of the second part of the composite key
     * @param compositeKeyThirdValue  the value of the third part of the composite key
     * @param compositeKeyFourthValue the value of the fourth part of the composite key
     */
    public UnexpectedEnumValueNotice(final String filename, final String fieldName,
                                     final Object enumValue,
                                     final String compositeKeyFirstPart, final String compositeKeySecondPart,
                                     final String compositeKeyThirdPart, final String compositeKeyFourthPart,
                                     final Object compositeKeyFirstValue, final Object compositeKeySecondValue,
                                     final Object compositeKeyThirdValue, final Object compositeKeyFourthValue) {
        super(filename, E_021,
                "Unexpected enum value",
                "Invalid value :`" + enumValue + "` - for field:`" + fieldName + "` in file:`" + filename +
                        "` for entity with composite id:`" +
                        "`" + compositeKeyFirstPart + "`: " + compositeKeyFirstValue + "`" + "--" +
                        "`" + compositeKeySecondPart + "`: " + compositeKeySecondValue + "`" + "--" +
                        "`" + compositeKeyThirdPart + "`: " + compositeKeyThirdValue + "`" + "--" +
                        "`" + compositeKeyFourthPart + "`: " + compositeKeyFourthValue + "`.",
                null);
        putNoticeSpecific(KEY_FIELD_NAME, fieldName);
        putNoticeSpecific(KEY_ENUM_VALUE, enumValue);
        putNoticeSpecific(KEY_FIELD_NAME, fieldName);
        putNoticeSpecific(KEY_COMPOSITE_KEY_FIRST_PART, compositeKeyFirstPart);
        putNoticeSpecific(KEY_COMPOSITE_KEY_SECOND_PART, compositeKeySecondPart);
        putNoticeSpecific(KEY_COMPOSITE_KEY_THIRD_PART, compositeKeyThirdPart);
        putNoticeSpecific(KEY_COMPOSITE_KEY_FOURTH_PART, compositeKeyFourthPart);
        putNoticeSpecific(KEY_COMPOSITE_KEY_FIRST_VALUE, compositeKeyFirstValue);
        putNoticeSpecific(KEY_COMPOSITE_KEY_SECOND_VALUE, compositeKeySecondValue);
        putNoticeSpecific(KEY_COMPOSITE_KEY_THIRD_VALUE, compositeKeyThirdValue);
        putNoticeSpecific(KEY_COMPOSITE_KEY_FOURTH_VALUE, compositeKeyFourthValue);
    }

    @Override
    public void export(final NoticeExporter exporter) throws IOException {
        exporter.export(this);
    }
}