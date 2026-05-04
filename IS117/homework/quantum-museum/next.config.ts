import type { NextConfig } from "next";

const nextConfig: NextConfig = {
    output: "export",
    basePath: "/projects/IS117-Quantum-museum",
    trailingSlash: true,
    images: {
        unoptimized: true,
    },
};

export default nextConfig;
