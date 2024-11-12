package com.jcloudify.initializer.file.hash;

import com.jcloudify.initializer.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
