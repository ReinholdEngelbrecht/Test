/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.kogito.process;

import org.kie.api.project.KieActivator;

import com.fasterxml.jackson.annotation.JsonProperty;

@KieActivator
public class ProcessItem {S

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Cpu")
    private Integer cpu;

    @JsonProperty("Pid")
    String pid;

    public ProcessItem() {
    }

    public ProcessItem(String name, String status, int cpu, String pid) {
        this.name = name;
        this.status = status;
        this.cpu = cpu;
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "ProcessItem [name=" + name + ", status=" + status + ", cpu=" + cpu + ", pid=" + pid + "]";
    }

}
