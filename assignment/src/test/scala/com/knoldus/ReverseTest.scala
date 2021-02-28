// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class ReverseTest extends AnyFlatSpec{

    // Object of ReverseImpl class
    val reverseImpl = new ReverseImpl()

    "Reverse" should "returns a list with reverse order" in {
        assert(reverseImpl.reverse(List(4,3,2,1)) == List(1,2,3,4))
    }

    "Reverse" should "returns a list with reverse order if negetive integer provided in a list" in {
        assert(reverseImpl.reverse(List(-4,3,-2,1)) == List(1,-2,3,-4))
    }

    "Reverse" should "returns a list with reverse order if all duplicate element provided" in {
        assert((reverseImpl.reverse(List(4,4,4,4)) == List(4,4,4,4)))
    }

    "Reverse" should "returns a list with reverse order if only one element is passed in the list" in {
        assert((reverseImpl.reverse(List(66)) == List(66)))
    }

    "Reverse" should "returns empty list if empty list provided" in {
        assert((reverseImpl.reverse(List()) == List()))
    }

    "Reverse" should "invalid as reverse of List(1,2,3,) is not List(1,3,2)" in {
        assert(!(reverseImpl.reverse(List(1,2,3)) == List(1,3,2)))
    }

}
