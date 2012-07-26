/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
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

package java.nio.channels;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.util.Set;

/**
 * Compatibility stub.
 */
public interface NetworkChannel extends Channel {
    NetworkChannel bind(SocketAddress local) throws IOException;
    SocketAddress getLocalAddress() throws IOException;
    <T> NetworkChannel setOption(SocketOption<T> name, T value) throws IOException;
    <T> T getOption(SocketOption<T> name) throws IOException;
    Set<SocketOption<?>> supportedOptions();
}